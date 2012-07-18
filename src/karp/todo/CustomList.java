package karp.todo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CustomList extends ListView
{
	private CustomAdapter adapter;

	public CustomList(Context context, AttributeSet attributes) {
		super(context, attributes);
		adapter = new CustomAdapter(context);
		setAdapter(adapter);
	
		setOnItemClickListener(new OnItemClickListener()
		{
			public void onItemClick(AdapterView<?> adapterView, View view, int position, long id)
			{
				adapter.getItem(position).setChecked(!adapter.getItem(position).getChecked());
				adapter.notifyDataSetChanged();
			}
		});
	}
	
	/*
	 * Getters
	 */
	
	public CustomAdapter getAdapter(){return adapter;}
	
}
