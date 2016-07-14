package org.ragecastle.zoeyinventory;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.Arrays;

/**
 * Created by jahall on 7/13/16.
 */
public class MainFragment extends Fragment {

    private ListView listViewProduct;
    private ProductsAdapter productsAdapter;

    public MainFragment (){ }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // TODO: Populate listView with conversation
        String [] tempProducts = {
                "Product_1",
                "Product_2",
                "Product_3"};

        productsAdapter = new ProductsAdapter(getActivity(), Arrays.asList(tempProducts));

        listViewProduct = (ListView) rootView.findViewById(R.id.listview_products);

        listViewProduct.setAdapter(productsAdapter);

        return rootView;
    }
}
