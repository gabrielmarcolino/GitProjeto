package com.example.gabrielamarcolino.tabacaria;

import com.google.firebase.auth;

public class ConfiguracaoFirebase {

    private static FirebaseAuth autenticacao;

    //  RETORNA A INSTANCIA DO FIREBASE
    public static FirebaseAuth getFirebaseAutenticacao() {

        if ( autenticacao == null ) {
            autenticacao = FirebaseAuth.getInstance();
        }
        return autenticacao;

    }
}
