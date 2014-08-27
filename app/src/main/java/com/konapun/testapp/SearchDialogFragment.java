package com.konapun.testapp;

import android.os.Bundle;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.widget.Toast;

/**
 * Dialog for searching through collections
 *
 * Created by konapun on 8/26/14.
 */
public class SearchDialogFragment extends DialogFragment {
   @Override
   public AlertDialog onCreateDialog(Bundle savedInstanceState) {
       AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
       builder.setMessage(R.string.dialog_search)
               .setPositiveButton(R.string.button_search, new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int i) {
                       Toast.makeText(getActivity(), "Searching", Toast.LENGTH_LONG).show(); // TODO
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
