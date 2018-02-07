package mayphoo.mpk.padc_animation.activities;

import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import mayphoo.mpk.padc_animation.R;
import mayphoo.mpk.padc_animation.adapters.TopicsAdapter;
import mayphoo.mpk.padc_animation.delegates.TopicItemDelegate;

public class MainActivity extends AppCompatActivity implements TopicItemDelegate{

    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.rv_topics)
    RecyclerView rvTopics;

    @BindView(R.id.constraintLayout)
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this, this);

        toolbar.setTitle("RoadMap to Become PAD");
        setSupportActionBar(toolbar);

        rvTopics.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        TopicsAdapter topicsAdapter = new TopicsAdapter(this);
        rvTopics.setAdapter(topicsAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.right_menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.menu_main_user){
            drawerLayout.openDrawer(GravityCompat.END);

            rvTopics.clearAnimation();

            //set the parameters to place image in center of layout - create new layout parameters.
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT);
            rvTopics.setLayoutParams(layoutParams);

            // load animation from resource file
            Animation scaleAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_animation);
            rvTopics.startAnimation(scaleAnimation);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onTapTopic() {
        drawerLayout.closeDrawers();
    }
}
