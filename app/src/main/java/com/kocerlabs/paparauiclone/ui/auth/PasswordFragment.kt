package com.kocerlabs.paparauiclone.ui.auth

import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnKeyListener
import android.view.ViewGroup
import com.kocerlabs.paparauiclone.databinding.FragmentPasswordBinding
import com.kocerlabs.paparauiclone.ui.base.BaseFragment
import com.kocerlabs.paparauiclone.util.goToBack

class PasswordFragment : BaseFragment<FragmentPasswordBinding>() {
    val TAG = "PasswordFragment"
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentPasswordBinding = FragmentPasswordBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding!!.btnBack.setOnClickListener {
            goToBack()
        }

        provideEditTextFunctionality()
    }

    private fun provideEditTextFunctionality() {
        with(binding!!) {

            linearPassword.setOnClickListener {
                // todo eğer soft keyboard kapalıysa kaldığı yerden devam et,
                // todo: eğer soft keyboard açıksa, bir işlem yapma.
                when {

                }
            }

            edtPass1.addTextChangedListener(object : CustomSAMTextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                    if (after == 1) {
                        edtPass2.requestFocus()
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
                        edtPass3.requestFocus()
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
                                edtPass1.focusable = View.FOCUSABLE
                                edtPass1.isFocusableInTouchMode = true
                                edtPass1.requestFocus()
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
                        edtPass4.requestFocus()
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
                                edtPass2.focusable = View.FOCUSABLE
                                edtPass2.isFocusableInTouchMode = true
                                edtPass2.requestFocus()
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
                        edtPass5.requestFocus()
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
                                edtPass3.focusable = View.FOCUSABLE
                                edtPass3.isFocusableInTouchMode = true
                                edtPass3.requestFocus()
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
                        edtPass6.requestFocus()
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
                                edtPass4.focusable = View.FOCUSABLE
                                edtPass4.isFocusableInTouchMode = true
                                edtPass4.requestFocus()
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
                    }
                }
            })

            edtPass6.setSoftKeyListener(object : OnKeyListener {
                override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {

                    if (keyCode == KeyEvent.KEYCODE_DEL) {
                        if (event?.action == KeyEvent.ACTION_DOWN) {
                            if (edtPass6.text.toString().isNullOrEmpty()) {
                                edtPass5.setText("")
                                edtPass5.focusable = View.FOCUSABLE
                                edtPass5.isFocusableInTouchMode = true
                                edtPass5.requestFocus()
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