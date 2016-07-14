package org.ragecastle.zoeyinventory;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jahall on 7/13/16.
 */
public class ProductsAdapter extends ArrayAdapter<String> {

    private static final String LOG_TAG = ProductsAdapter.class.getSimpleName();
    private int lastPosition;
    private TextView textView;

    public ProductsAdapter(Activity context, List<String> contact) {
        super(context, 0, contact);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        lastPosition = position;
        String contact = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item_product, parent, false);
        }

        textView = (TextView) convertView.findViewById(R.id.product);
        textView.setText(contact);
        // TODO: Remove log
        Log.e(LOG_TAG, "Position: " + String.valueOf(position));
        return convertView;
    }

    @Override
    public void add(String contact) {
        textView.setText(contact);
    }
}
