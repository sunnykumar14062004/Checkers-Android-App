package com.example.checkers;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    boolean can_move(Button button){
        TextView message = findViewById(R.id.message);
        String opposite = Character.toString(message.getText().toString().charAt(0));

        Button target_1 = null, target_2 = null, kill_target_1 = null, kill_target_2 = null;
        Button target_3 = null, target_4 = null, kill_target_3 = null, kill_target_4 = null;
        boolean target_1_exists = false, target_2_exists = false;
        boolean kill_target_1_exists = false, kill_target_2_exists = false;
        boolean target_3_exists = false, target_4_exists = false;
        boolean kill_target_3_exists = false, kill_target_4_exists = false;

        if (opposite.equals("o")) {
            if (button.getId() + 9 < 89) {
                if (Integer.toString(button.getId() + 9).charAt(1) != '0') {
                    target_1 = findViewById(button.getId() + 9);
                    target_1_exists = true;
                }
            }
            if (button.getId() + 11 < 89) {
                if (Integer.toString(button.getId() + 11).charAt(1) != '9') {
                    target_2 = findViewById(button.getId() + 11);
                    target_2_exists = true;
                }
            }
            if (button.getId() + 18 < 89) {
                if ((Integer.toString(button.getId() + 18).charAt(1) != '9') && (Integer.toString(button.getId() + 18).charAt(1) != '0')) {
                    kill_target_1 = findViewById(button.getId() + 18);
                    kill_target_1_exists = true;
                }
            }
            if (button.getId() + 22 < 89) {
                if ((Integer.toString(button.getId() + 22).charAt(1) != '9') && (Integer.toString(button.getId() + 22).charAt(1) != '0')) {
                    kill_target_2 = findViewById(button.getId() + 22);
                    kill_target_2_exists = true;
                }
            }

            if (button.getTextColors().getDefaultColor() == Color.CYAN) {
                if (button.getId() - 9 > 10){
                    if (Integer.toString(button.getId() - 9).charAt(1) != '9'){
                        target_3 = findViewById(button.getId() - 9);
                        target_3_exists = true;
                    }
                }
                if (button.getId() - 11 > 10){
                    if (Integer.toString(button.getId() - 11).charAt(1) != '0'){
                        target_4 = findViewById(button.getId() - 11);
                        target_4_exists = true;
                    }
                }
                if (button.getId() - 18 > 10){
                    if ((Integer.toString(button.getId() - 18).charAt(1) != '0') && (Integer.toString(button.getId() - 18).charAt(1) != '9')){
                        kill_target_3 = findViewById(button.getId() - 18);
                        kill_target_3_exists = true;
                    }
                }
                if (button.getId() - 22 > 10){
                    if ((Integer.toString(button.getId() - 22).charAt(1) != '0') && (Integer.toString(button.getId() - 22).charAt(1) != '9')){
                        kill_target_4 = findViewById(button.getId() - 22);
                        kill_target_4_exists = true;
                    }
                }
            }
        }

        else {
            if (button.getId() - 9 > 10) {
                if (Integer.toString(button.getId() - 9).charAt(1) != '9') {
                    target_1 = findViewById(button.getId() - 9);
                    target_1_exists = true;
                }
            }
            if (button.getId() - 11 > 10) {
                if (Integer.toString(button.getId() - 11).charAt(1) != '0') {
                    target_2 = findViewById(button.getId() - 11);
                    target_2_exists = true;
                }
            }
            if (button.getId() - 18 > 10) {
                if ((Integer.toString(button.getId() - 18).charAt(1) != '9') && (Integer.toString(button.getId() - 18).charAt(1) != '0')) {
                    kill_target_1 = findViewById(button.getId() - 18);
                    kill_target_1_exists = true;
                }
            }
            if (button.getId() - 22 > 10) {
                if ((Integer.toString(button.getId() - 22).charAt(1) != '9') && (Integer.toString(button.getId() - 22).charAt(1) != '0')) {
                    kill_target_2 = findViewById(button.getId() - 22);
                    kill_target_2_exists = true;
                }
            }

            if (button.getTextColors().getDefaultColor() == Color.CYAN) {
                if (button.getId() + 9 < 89){
                    if (Integer.toString(button.getId() + 9).charAt(1) != '0'){
                        target_3 = findViewById(button.getId() + 9);
                        target_3_exists = true;
                    }
                }
                if (button.getId() + 11 < 89){
                    if (Integer.toString(button.getId() + 11).charAt(1) != '9'){
                        target_4 = findViewById(button.getId() + 11);
                        target_4_exists = true;
                    }
                }
                if (button.getId() + 18 < 89){
                    if ((Integer.toString(button.getId() + 18).charAt(1) != '0') && (Integer.toString(button.getId() + 18).charAt(1) != '9')){
                        kill_target_3 = findViewById(button.getId() + 18);
                        kill_target_3_exists = true;
                    }
                }
                if (button.getId() + 22 < 89){
                    if ((Integer.toString(button.getId() + 22).charAt(1) != '0') && (Integer.toString(button.getId() + 22).charAt(1) != '9')){
                        kill_target_4 = findViewById(button.getId() + 22);
                        kill_target_4_exists = true;
                    }
                }
            }
        }

        if (target_1_exists) {
            if (target_1.getText().toString().equals(" ")) {
                return true;
            }
        }
        if (kill_target_1_exists) {
            assert target_1 != null;
            if (target_1.getText().toString().equals(opposite)) {
                if (kill_target_1.getText().toString().equals(" ")) {
                    return true;
                }
            }
        }
        if (target_2_exists) {
            if (target_2.getText().toString().equals(" ")) {
                return true;
            }
        }
        if (kill_target_2_exists) {
            assert target_2 != null;
            if (target_2.getText().toString().equals(opposite)) {
                if (kill_target_2.getText().toString().equals(" ")) {
                    return true;
                }
            }
        }
        if (target_3_exists) {
            if (target_3.getText().toString().equals(" ")) {
                return true;
            }
        }
        if (kill_target_3_exists) {
            assert target_3 != null;
            if (target_3.getText().toString().equals(opposite)) {
                if (kill_target_3.getText().toString().equals(" ")) {
                    return true;
                }
            }
        }
        if (target_4_exists) {
            if (target_4.getText().toString().equals(" ")) {
                return true;
            }
        }
        if (kill_target_4_exists) {
            assert target_4 != null;
            if (target_4.getText().toString().equals(opposite)) {
                return kill_target_4.getText().toString().equals(" ");
            }
        }
        return false;
    }

    void status_of_buttons (boolean to_enable){
        for (int m = 0; m != 8; m++) {
            for (int n = 0; n != 8; n++) {
                Button all_button = findViewById((m + 1) * 10 + (n + 1));
                all_button.setEnabled(to_enable);
            }
        }
    }

    boolean is_won(){
        TextView message = findViewById(R.id.message);
        String opponent;
        if (message.getText().toString().charAt(0) == 'x'){
            opponent = "o";
        }
        else {
            opponent = "x";
        }
        int no_of_opp = 0, no_of_move_opp = 0;
        for (int m = 0; m != 8; m++) {
            for (int n = 0; n != 8; n++) {
                Button all_button = findViewById((m + 1) * 10 + (n + 1));
                if (all_button.getText().toString().equals(opponent)){
                    no_of_opp++;
                    if (can_move(all_button)){
                        no_of_move_opp++;
                    }
                }
            }
        }
        return (no_of_opp == 0) || (no_of_move_opp == 0);
    }

    void make_text_default(){
        for (int m = 0; m != 8; m++){
            for (int n = 0; n != 8; n++){
                Button all_button = findViewById((m + 1) * 10 + (n + 1));
                all_button.setTextColor(Color.WHITE);
                if ((m + n) % 2 == 0){
                    all_button.setBackgroundColor(Color.WHITE);
                    all_button.setText(" ");
                }
                else{
                    all_button.setBackgroundColor(Color.BLACK);
                    if (m < 3){
                        all_button.setText("x");
                    }
                    else if (m > 4){
                        all_button.setText("o");
                    }
                    else{
                        all_button.setText(" ");
                    }
                }
            }
        }
    }

    void make_color_default(){
        for (int m = 0; m != 8; m++){
            for (int n = 0; n != 8; n++){
                Button all_button = findViewById((m + 1) * 10 + (n + 1));
                if ((m + n) % 2 == 0) {
                    all_button.setBackgroundColor(Color.WHITE);
                }
                else {
                    all_button.setBackgroundColor(Color.BLACK);
                }
            }
        }
    }

    @SuppressLint({"SetTextI18n", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout = findViewById(R.id.layout);
        TextView message = findViewById(R.id.message);
        Button restart = findViewById(R.id.restart);
        int i, j, id;
        final int[] active_id = new int[1];

        restart.setOnClickListener(view -> {
            make_text_default();
            make_color_default();
            status_of_buttons(true);
            message.setText("x's turn");
        });

        for (i = 0; i != 8; i++){
            LinearLayout row = new LinearLayout(this);
            row.setOrientation(LinearLayout.HORIZONTAL);
            for (j = 0; j != 8; j++){

                Button button = new Button(this);
                button.setOnClickListener(view -> {

                    Button target_1 = null, target_2 = null, kill_target_1 = null, kill_target_2 = null;
                    Button target_3 = null, target_4 = null, kill_target_3 = null, kill_target_4 = null;
                    boolean target_1_exists = false, target_2_exists = false;
                    boolean kill_target_1_exists = false, kill_target_2_exists = false;
                    boolean target_3_exists = false, target_4_exists = false;
                    boolean kill_target_3_exists = false, kill_target_4_exists = false;
                    String opposite;

                    if (((ColorDrawable) button.getBackground()).getColor() == Color.BLACK) {
                        make_color_default();
                        active_id[0] = button.getId();

                        if (message.getText().toString().charAt(0) == button.getText().charAt(0)) {
                            button.setBackgroundColor(Color.GRAY);
                            if (message.getText().toString().charAt(0) == 'x') {
                                opposite = "o";
                            }
                            else {
                                opposite = "x";
                            }

                            if (opposite.equals("o")) {
                                if (button.getId() + 9 < 89) {
                                    if (Integer.toString(button.getId() + 9).charAt(1) != '0') {
                                        target_1 = findViewById(button.getId() + 9);
                                        target_1_exists = true;
                                    }
                                }
                                if (button.getId() + 11 < 89) {
                                    if (Integer.toString(button.getId() + 11).charAt(1) != '9') {
                                        target_2 = findViewById(button.getId() + 11);
                                        target_2_exists = true;
                                    }
                                }
                                if (button.getId() + 18 < 89) {
                                    if ((Integer.toString(button.getId() + 18).charAt(1) != '9') && (Integer.toString(button.getId() + 18).charAt(1) != '0')) {
                                        kill_target_1 = findViewById(button.getId() + 18);
                                        kill_target_1_exists = true;
                                    }
                                }
                                if (button.getId() + 22 < 89) {
                                    if ((Integer.toString(button.getId() + 22).charAt(1) != '9') && (Integer.toString(button.getId() + 22).charAt(1) != '0')) {
                                        kill_target_2 = findViewById(button.getId() + 22);
                                        kill_target_2_exists = true;
                                    }
                                }

                                if (button.getTextColors().getDefaultColor() == Color.CYAN) {
                                    if (button.getId() - 9 > 10){
                                        if (Integer.toString(button.getId() - 9).charAt(1) != '9'){
                                            target_3 = findViewById(button.getId() - 9);
                                            target_3_exists = true;
                                        }
                                    }
                                    if (button.getId() - 11 > 10){
                                        if (Integer.toString(button.getId() - 11).charAt(1) != '0'){
                                            target_4 = findViewById(button.getId() - 11);
                                            target_4_exists = true;
                                        }
                                    }
                                    if (button.getId() - 18 > 10){
                                        if ((Integer.toString(button.getId() - 18).charAt(1) != '0') && (Integer.toString(button.getId() - 18).charAt(1) != '9')){
                                            kill_target_3 = findViewById(button.getId() - 18);
                                            kill_target_3_exists = true;
                                        }
                                    }
                                    if (button.getId() - 22 > 10){
                                        if ((Integer.toString(button.getId() - 22).charAt(1) != '0') && (Integer.toString(button.getId() - 22).charAt(1) != '9')){
                                            kill_target_4 = findViewById(button.getId() - 22);
                                            kill_target_4_exists = true;
                                        }
                                    }

                                }
                            }

                            else {
                                if (button.getId() - 9 > 10) {
                                    if (Integer.toString(button.getId() - 9).charAt(1) != '9') {
                                        target_1 = findViewById(button.getId() - 9);
                                        target_1_exists = true;
                                    }
                                }
                                if (button.getId() - 11 > 10) {
                                    if (Integer.toString(button.getId() - 11).charAt(1) != '0') {
                                        target_2 = findViewById(button.getId() - 11);
                                        target_2_exists = true;
                                    }
                                }
                                if (button.getId() - 18 > 10) {
                                    if ((Integer.toString(button.getId() - 18).charAt(1) != '9') && (Integer.toString(button.getId() - 18).charAt(1) != '0')) {
                                        kill_target_1 = findViewById(button.getId() - 18);
                                        kill_target_1_exists = true;
                                    }
                                }
                                if (button.getId() - 22 > 10) {
                                    if ((Integer.toString(button.getId() - 22).charAt(1) != '9') && (Integer.toString(button.getId() - 22).charAt(1) != '0')) {
                                        kill_target_2 = findViewById(button.getId() - 22);
                                        kill_target_2_exists = true;
                                    }
                                }

                                if (button.getTextColors().getDefaultColor() == Color.CYAN) {
                                    if (button.getId() + 9 < 89){
                                        if (Integer.toString(button.getId() + 9).charAt(1) != '0'){
                                            target_3 = findViewById(button.getId() + 9);
                                            target_3_exists = true;
                                        }
                                    }
                                    if (button.getId() + 11 < 89){
                                        if (Integer.toString(button.getId() + 11).charAt(1) != '9'){
                                            target_4 = findViewById(button.getId() + 11);
                                            target_4_exists = true;
                                        }
                                    }
                                    if (button.getId() + 18 < 89){
                                        if ((Integer.toString(button.getId() + 18).charAt(1) != '0') && (Integer.toString(button.getId() + 18).charAt(1) != '9')){
                                            kill_target_3 = findViewById(button.getId() + 18);
                                            kill_target_3_exists = true;
                                        }
                                    }
                                    if (button.getId() + 22 < 89){
                                        if ((Integer.toString(button.getId() + 22).charAt(1) != '0') && (Integer.toString(button.getId() + 22).charAt(1) != '9')){
                                            kill_target_4 = findViewById(button.getId() + 22);
                                            kill_target_4_exists = true;
                                        }
                                    }

                                }
                            }

                            if (target_1_exists) {
                                if (target_1.getText().toString().equals(" ")) {
                                    target_1.setBackgroundColor(Color.BLUE);
                                }
                            }
                            if (kill_target_1_exists) {
                                assert target_1 != null;
                                if (target_1.getText().toString().equals(opposite)) {
                                    if (kill_target_1.getText().toString().equals(" ")) {
                                        kill_target_1.setBackgroundColor(Color.BLUE);
                                    }
                                }
                            }
                            if (target_2_exists) {
                                if (target_2.getText().toString().equals(" ")) {
                                    target_2.setBackgroundColor(Color.BLUE);
                                }
                            }
                            if (kill_target_2_exists) {
                                assert target_2 != null;
                                if (target_2.getText().toString().equals(opposite)) {
                                    if (kill_target_2.getText().toString().equals(" ")) {
                                        kill_target_2.setBackgroundColor(Color.BLUE);
                                    }
                                }
                            }
                            if (target_3_exists) {
                                if (target_3.getText().toString().equals(" ")) {
                                    target_3.setBackgroundColor(Color.BLUE);
                                }
                            }
                            if (kill_target_3_exists) {
                                assert target_3 != null;
                                if (target_3.getText().toString().equals(opposite)) {
                                    if (kill_target_3.getText().toString().equals(" ")) {
                                        kill_target_3.setBackgroundColor(Color.BLUE);
                                    }
                                }
                            }
                            if (target_4_exists) {
                                if (target_4.getText().toString().equals(" ")) {
                                    target_4.setBackgroundColor(Color.BLUE);
                                }
                            }
                            if (kill_target_4_exists) {
                                assert target_4 != null;
                                if (target_4.getText().toString().equals(opposite)) {
                                    if (kill_target_4.getText().toString().equals(" ")) {
                                        kill_target_4.setBackgroundColor(Color.BLUE);
                                    }
                                }
                            }

                        }
                    }

                    else if (((ColorDrawable) button.getBackground()).getColor() == Color.BLUE) {
                        button.setText(Character.toString(message.getText().toString().charAt(0)));
                        if ((button.getText().toString().equals("x")) && (Integer.toString(button.getId()).charAt(0) == '8')){
                            button.setTextColor(Color.CYAN);
                        }
                        else if ((button.getText().toString().equals("o")) && (Integer.toString(button.getId()).charAt(0) == '1')){
                            button.setTextColor(Color.CYAN);
                        }

                        Button active_button = findViewById(active_id[0]);
                        active_button.setText(" ");
                        active_button.setBackgroundColor(Color.BLACK);

                        if (active_button.getTextColors().getDefaultColor() == Color.CYAN){
                            button.setTextColor(Color.CYAN);
                        }
                        active_button.setTextColor(Color.WHITE);

                        int to_kill = 0;
                        if (button.getId() - active_id[0] == 18){
                            to_kill = 9;
                        }
                        else if (button.getId() - active_id[0] == 22){
                            to_kill = 11;
                        }
                        else if (button.getId() - active_id[0] == -18){
                            to_kill = -9;
                        }
                        else if (button.getId() - active_id[0] == -22){
                            to_kill = -11;
                        }

                        if (to_kill != 0){
                            Button to_kill_button = findViewById(active_id[0] + to_kill);
                            to_kill_button.setText(" ");
                            to_kill_button.setTextColor(Color.WHITE);
                        }

                        if (is_won()){
                            message.setText(message.getText().toString().charAt(0) + " won");
                            status_of_buttons(false);
                        }
                        else {
                            if (message.getText().toString().charAt(0) == 'x') {
                                message.setText("o's turn");
                            }
                            else if (message.getText().toString().charAt(0) == 'o') {
                                message.setText("x's turn");
                            }
                        }
                        make_color_default();
                    }
                });

                button.setLayoutParams(new LinearLayout.LayoutParams(180, LinearLayout.LayoutParams.WRAP_CONTENT));
                button.setTextColor(Color.WHITE);

                if ((i + j) % 2 == 0){
                    button.setBackgroundColor(Color.WHITE);
                    button.setText(" ");
                }
                else{
                    button.setBackgroundColor(Color.BLACK);
                    if (i < 3){
                        button.setText("x");
                    }
                    else if (i > 4){
                        button.setText("o");
                    }
                    else{
                        button.setText(" ");
                    }
                }

                id = (i + 1) * 10 + (j + 1);
                button.setId(id);
                row.addView(button);
            }
            layout.addView(row);
        }
        message.setTextColor(Color.BLACK);
        message.setText("x's turn");
    }
    public void show_credit(View view){
        Intent intent_credit = new Intent(this, Credit.class);
        startActivity(intent_credit);
    }
}