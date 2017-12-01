package mayphoo.mpk.padc_animation.components;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mayphoo.mpk.padc_animation.R;
import mayphoo.mpk.padc_animation.delegates.TopicItemDelegate;

/**
 * Created by User on 12/1/2017.
 */

public class RightMenuPane extends LinearLayout {


    @BindView(R.id.cv_first_topic)
    CardView firstTopic;

    @BindView(R.id.cv_second_topic)
    CardView secondTopic;

    @BindView(R.id.cv_third_topic)
    CardView thirdTopic;

    @BindView(R.id.cv_fourth_topic)
    CardView fourthTopic;

    TopicItemDelegate topicItemDelegate;

    public RightMenuPane(Context context) {
        super(context);
        topicItemDelegate = (TopicItemDelegate) context;
    }

    public RightMenuPane(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        topicItemDelegate = (TopicItemDelegate) context;
    }

    public RightMenuPane(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        topicItemDelegate = (TopicItemDelegate) context;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this, this);
        firstTopic.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                topicItemDelegate.onTapTopic();
            }
        });
    }

}
