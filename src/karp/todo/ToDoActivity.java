package karp.todo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ToDoActivity extends Activity
{
	EditText editText;
	CustomList customList;
	
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        customList = (CustomList) findViewById(R.id.customList);
        editText = (EditText) findViewById(R.id.editText);
        Button addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v)
			{
				String str = editText.getText().toString();
				if(!str.equals(""))
				{
					customList.getAdapter().addItem(new Item(str));
					editText.setText("");
				}
			}
		});
    }
    
    public void onResume()
    {
    	// TODO save to SQL
    	super.onResume();
    }
    
    public void onPause()
    {
    	// TODO restore from SQLite
    	super.onPause();
    }
}