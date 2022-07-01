package com.projeto.projeto_final.controller;

import android.app.Activity;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.projeto.projeto_final.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
     FirebaseFirestore db = FirebaseFirestore.getInstance();


    public void criateUser(User user){
        try {
            db.collection("users").add(user);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public boolean login(String email, String senha){
        CollectionReference usersRef = db.collection("users");
        Query query = usersRef.whereEqualTo("email", email).whereEqualTo("senha", senha);
        return true;

    }



}
