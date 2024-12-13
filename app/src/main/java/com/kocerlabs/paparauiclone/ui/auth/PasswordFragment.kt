package com.kocerlabs.paparauiclone.ui.auth

import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnKeyListener
import android.view.ViewGroup
import android.widget.EditText
import com.kocerlabs.paparauiclone.R
import com.kocerlabs.paparauiclone.databinding.FragmentPasswordBinding
import com.kocerlabs.paparauiclone.ui.base.BaseFragment
import com.kocerlabs.paparauiclone.util.goToBack
import com.kocerlabs.paparauiclone.util.goToOtherFragment

class PasswordFragment : BaseFragment<FragmentPasswordBinding>() {
    val TAG = "PasswordFragment"
    private lateinit var activityRootView: View
    private var isSoftKeyboardOpen = false

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentPasswordBinding = FragmentPasswordBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activityRootView = requireActivity().findViewById(R.id.main)

        binding!!.btnBack.setOnClickListener {
            goToBack()
        }

        provideEditTextFunctionality()
//        observeSoftKeyboard()


    }

    // todo focus özelliklerini ayarla
//    private fun View.showKeyboard(edttext: EditText) {
//        val inputMethodManager =
//            requireContext().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        inputMethodManager.showSoftInput(edttext, InputMethodManager.SHOW_IMPLICIT)
//    }
//
//    private fun observeSoftKeyboard() {
//        ViewCompat.setOnApplyWindowInsetsListener(activityRootView) { _, insets ->
//            isSoftKeyboardOpen = insets.isVisible(WindowInsetsCompat.Type.ime())
//            // true ise klavye açık, false ise kapalı
//            insets
//        }
//    }
//
//    private fun manageFocusable(edttext: EditText, openOrCLose: Boolean = true) {
//        if (openOrCLose) openFocus(edttext) else closeFocus(edttext)
//    }
//
//    private fun closeFocus(edttext: EditText) {
//        with(binding!!) {
//            edttext.focusable = View.NOT_FOCUSABLE
//        }
//    }
//
//    private fun openFocus(edttext: EditText) {
//        with(binding!!) {
//            edttext.focusable = View.FOCUSABLE
//            edttext.isFocusableInTouchMode = true
//        }
//    }

    private fun openFocusAndFocusEdtText(edttext: EditText) {
        with(binding!!) {
            edttext.focusable = View.FOCUSABLE
            edttext.isFocusableInTouchMode = true
            edttext.requestFocus()
        }
    }

    private fun provideEditTextFunctionality() {
        with(binding!!) {

            edtPass1.addTextChangedListener(object : CustomSAMTextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                    if (after == 1) {
                        openFocusAndFocusEdtText(edtPass2)
                        edtPass1.focusable = View.NOT_FOCUSABLE
                    }
                }
            })


            edtPass2.addTextChangedListener(object : CustomSAMTextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                    if (after == 1) {
                        openFocusAndFocusEdtText(edtPass3)
                        edtPass2.focusable = View.NOT_FOCUSABLE
                    }
                }
            })

            edtPass2.setSoftKeyListener(object : OnKeyListener {
                override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {
                    // doluyken silme işlemi yaparken önce burası,
                    // sonra alt kısımdaki if'lerin içini,
                    // sonra burasını tekrar,
                    // en sonda beforeTextChanged'ı çalıştırıyor.

                    // boşken silme işlemi yaparken
                    // burası
                    // aşağıdaki kod
                    // sonra tekrar burası.
                    // beforeTextChanged çalışmıyor

                    if (keyCode == KeyEvent.KEYCODE_DEL) {
                        // NOT: Burayı 1 kere çalıştırıyor.
                        if (event?.action == KeyEvent.ACTION_DOWN) {
                            if (edtPass2.text.toString().isNullOrEmpty()) {
                                // focusu 1'e ata ve 1'in içindeki text'i sil.
                                edtPass1.setText("")
                                openFocusAndFocusEdtText(edtPass1)
                            }
                            return true
                        }
                    }
                    // Diğer tuşlar için super.onKey() çağrısı yapılır
                    return false
                }
            })


            edtPass3.addTextChangedListener(object : CustomSAMTextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                    if (after == 1) {
                        openFocusAndFocusEdtText(edtPass4)
                        edtPass3.focusable = View.NOT_FOCUSABLE
                    }
                }
            })

            edtPass3.setSoftKeyListener(object : OnKeyListener {
                override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {

                    if (keyCode == KeyEvent.KEYCODE_DEL) {
                        if (event?.action == KeyEvent.ACTION_DOWN) {
                            if (edtPass3.text.toString().isNullOrEmpty()) {
                                edtPass2.setText("")
                                openFocusAndFocusEdtText(edtPass2)
                            }
                            return true
                        }
                    }
                    // Diğer tuşlar için super.onKey() çağrısı yapılır
                    return false
                }
            })


            edtPass4.addTextChangedListener(object : CustomSAMTextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                    if (after == 1) {
                        openFocusAndFocusEdtText(edtPass5)
                        edtPass4.focusable = View.NOT_FOCUSABLE
                    }
                }
            })

            edtPass4.setSoftKeyListener(object : OnKeyListener {
                override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {

                    if (keyCode == KeyEvent.KEYCODE_DEL) {
                        if (event?.action == KeyEvent.ACTION_DOWN) {
                            if (edtPass4.text.toString().isNullOrEmpty()) {
                                edtPass3.setText("")
                                openFocusAndFocusEdtText(edtPass3)
                            }
                            return true
                        }
                    }
                    // Diğer tuşlar için super.onKey() çağrısı yapılır
                    return false
                }
            })


            edtPass5.addTextChangedListener(object : CustomSAMTextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                    if (after == 1) {
                        openFocusAndFocusEdtText(edtPass6)
                        edtPass5.focusable = View.NOT_FOCUSABLE
                    }
                }
            })

            edtPass5.setSoftKeyListener(object : OnKeyListener {
                override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {

                    if (keyCode == KeyEvent.KEYCODE_DEL) {
                        if (event?.action == KeyEvent.ACTION_DOWN) {
                            if (edtPass5.text.toString().isNullOrEmpty()) {
                                edtPass4.setText("")
                                openFocusAndFocusEdtText(edtPass4)
                            }
                            return true
                        }
                    }
                    // Diğer tuşlar için super.onKey() çağrısı yapılır
                    return false
                }
            })

            edtPass6.addTextChangedListener(object : CustomSAMTextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                    if (after == 1) {
                        // todo view model'e istek at ve doğrulama yap
                        goToOtherFragment(PasswordFragmentDirections.passwordFragmentToNavAccount())
                    }
                }
            })

            edtPass6.setSoftKeyListener(object : OnKeyListener {
                override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {

                    if (keyCode == KeyEvent.KEYCODE_DEL) {
                        if (event?.action == KeyEvent.ACTION_DOWN) {
                            if (edtPass6.text.toString().isNullOrEmpty()) {
                                edtPass5.setText("")
                                openFocusAndFocusEdtText(edtPass5)
                            }
                            return true
                        }
                    }
                    // Diğer tuşlar için super.onKey() çağrısı yapılır
                    return false
                }
            })
        }
    }
}