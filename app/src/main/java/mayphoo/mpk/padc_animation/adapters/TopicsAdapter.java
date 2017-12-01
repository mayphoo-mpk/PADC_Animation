package mayphoo.mpk.padc_animation.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mayphoo.mpk.padc_animation.R;
import mayphoo.mpk.padc_animation.delegates.TopicItemDelegate;
import mayphoo.mpk.padc_animation.viewholders.TopicViewHolder;

/**
 * Created by User on 12/1/2017.
 */

public class TopicsAdapter extends RecyclerView.Adapter<TopicViewHolder>{

    private TopicItemDelegate mTopicItemDelegate;

    public TopicsAdapter(TopicItemDelegate mTopicItemDelegate) {
        this.mTopicItemDelegate = mTopicItemDelegate;
    }

    @Override
    public TopicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View topicView = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item_topics, parent, false);
        return new TopicViewHolder(topicView, mTopicItemDelegate);
    }

    @Override
    public void onBindViewHolder(TopicViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
