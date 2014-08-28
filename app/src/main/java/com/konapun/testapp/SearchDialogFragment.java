package com.konapun.testapp;

import android.os.Bundle;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Dialog for searching through collections
 *
 * Created by konapun on 8/26/14.
 */
public class SearchDialogFragment extends DialogFragment {
   @Override
   public AlertDialog onCreateDialog(Bundle savedInstanceState) {
       final EditText searchField = new EditText(getActivity());

       AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
       builder.setMessage(R.string.dialog_search)
               .setView(searchField)
               .setPositiveButton(R.string.button_search, new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int i) {
                       String text = searchField.getText().toString();
                       Toast.makeText(getActivity(), "Searching for " + text, Toast.LENGTH_LONG).show(); // TODO
                   }
               })
               .setNegativeButton(R.string.button_cancel, new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int i) {
                       // Dismiss
                   }
               });
       return builder.create();
   }

}
