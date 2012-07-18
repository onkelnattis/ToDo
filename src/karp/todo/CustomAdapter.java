package karp.todo;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter
{
	private Context context;
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public CustomAdapter(Context context)
	{
		this.context = context;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		Item item = items.get(position);
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(R.layout.list_row, parent, false);
		TextView itemName = (TextView) view.findViewById(R.id.textView);
		ImageView checkBox = (ImageView) view.findViewById(R.id.checkBox);
		itemName.setText(item.getName());
		checkBox.setImageResource(item.getChecked() ? android.R.drawable.checkbox_on_background : android.R.drawable.checkbox_off_background);
		
		return view;
	}
	
	public void addItem(Item item)
	{
		items.add(item);
		notifyDataSetChanged();
	}
	
	/*
	 * Getters
	 */
	
	@Override
	public int getCount(){return items.size();}

	@Override
	public long getItemId(int position){return position;}
	
	@Override
	public Item getItem(int position){return items.get(position);}

}