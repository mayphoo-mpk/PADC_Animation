package mayphoo.mpk.padc_animation.viewholders;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mayphoo.mpk.padc_animation.R;
import mayphoo.mpk.padc_animation.delegates.TopicItemDelegate;

/**
 * Created by User on 12/2/2017.
 */

public class TopicViewHolder extends RecyclerView.ViewHolder {

    TopicItemDelegate mTopicItemDelegate;

    public TopicViewHolder(View itemView, TopicItemDelegate topicItemDelegate) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        mTopicItemDelegate = topicItemDelegate;
    }


}
