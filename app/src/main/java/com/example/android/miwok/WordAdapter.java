package com.example.android.miwok;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by khushbu on 7/12/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
                if(listItemView == null) {
                        listItemView = LayoutInflater.from(getContext()).inflate(
                                        R.layout.list_item, parent, false);
                    }

                        // Get the {@link AndroidFlavor} object located at this position in the list
                                Word currentWord = getItem(position);

                        // Find the TextView in the list_item.xml layout with the ID version_name
                                TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok_word);
                // Get the version name from the current AndroidFlavor object and
                        // set this text on the name TextView
                              nameTextView.setText(currentWord.getMiwokTranslation());

                        // Find the TextView in the list_item.xml layout with the ID version_number
                                TextView numberTextView = (TextView) listItemView.findViewById(R.id.english_word);
                // Get the version number from the current AndroidFlavor object and
                        // set this text on the number TextView
                                numberTextView.setText(currentWord.getDefaultTranslation());

                        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
                                ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
                // Get the image resource ID from the current AndroidFlavor object and
                        // set the image to iconView
                                iconView.setImageResource(currentWord.getResourseId());

                        // Return the whole list item layout (containing 2 TextViews and an ImageView)
                                // so that it can be shown in the ListView
                                        return listItemView;

        return super.getView(position, convertView, parent);
    }
}
