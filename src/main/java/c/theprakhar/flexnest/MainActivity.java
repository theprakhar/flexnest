package c.theprakhar.flexnest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import c.theprakhar.flexnest.adapters.Feedadapter;
import c.theprakhar.flexnest.databinding.ActivityMainBinding;
import c.theprakhar.flexnest.models.User;

import android.os.Bundle;
import android.widget.Toast;


import java.util.List;

public class MainActivity extends AppCompatActivity {
viewmodel vm;

ActivityMainBinding binding;
    ItemClickListener listener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);
        vm= new ViewModelProvider(this).get(viewmodel.class);
         listener=new ItemClickListener() {
            @Override
            public void onContactClick(User item) {
                Toast.makeText(MainActivity.this,item.getFirst_name()+" "+item.getLast_name(),Toast.LENGTH_LONG).show();

            }
             @Override
             public void onStoryClick(User item) {
                 Toast.makeText(MainActivity.this,item.getFirst_name()+"'s Story Clicked",Toast.LENGTH_LONG).show();

             }
        };

        binding.setFeedAdapter(new Feedadapter( this, listener));
        vm.getAllUsers().observe(this, new Observer<List<User>>() {
            @Override
            public void onChanged(List<User> users) {


                binding.getFeedAdapter().setUsers(users);
                binding.getFeedAdapter().setStories(users);

            }
        });
    }

}
