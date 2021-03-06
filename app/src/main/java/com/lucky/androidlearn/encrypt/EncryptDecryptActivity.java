package com.lucky.androidlearn.encrypt;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.lucky.androidlearn.R;

import butterknife.ButterKnife;
import butterknife.OnClick;


/*
* @author
* */
public class EncryptDecryptActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encrypt_decrypt);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_aes)
    public void onAESClick(View view){
        String encodeRules = "123448594666666666666666666";
        String content = "ASDIAGHEIHEIHGI3QHG";
        String encryptContent = AESTools.AESEncode2(encodeRules, content);
        System.out.println("EncryptContent "+encryptContent);
        String decryptContent = AESTools.AESDncode2(encodeRules, encryptContent);
        System.out.println("DecryptContent "+decryptContent);
    }
}
