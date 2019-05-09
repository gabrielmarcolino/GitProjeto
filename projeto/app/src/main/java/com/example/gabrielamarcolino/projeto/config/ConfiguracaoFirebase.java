package com.example.gabrielamarcolino.projeto.config;

import com.google.firebase.auth.FirebaseAuth;

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
