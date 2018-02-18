package com.example.rezky.rezky_1202154220_modul2;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;

import java.util.Calendar;

public class DatePickerFragment  extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Digunakan untuk mengambil data tanggal bulan dan tahun
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it.
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
     //Untuk melakukan input tanggal bulan dan tahun yang dipilih
        TakeAway activity = (TakeAway) getActivity();
        // Invoke Main Activity's processDatePickerResult() method.
        activity.processDatePickerResult(i, i1, i2);
    }
}
