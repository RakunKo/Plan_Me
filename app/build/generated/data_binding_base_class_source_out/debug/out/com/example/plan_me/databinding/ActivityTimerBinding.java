// Generated by view binder compiler. Do not edit!
package com.example.plan_me.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.example.plan_me.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.relex.circleindicator.CircleIndicator3;

public final class ActivityTimerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ViewPager2 timerViewpager;

  @NonNull
  public final CircleIndicator3 timerViewpagerIndicator;

  private ActivityTimerBinding(@NonNull ConstraintLayout rootView,
      @NonNull ViewPager2 timerViewpager, @NonNull CircleIndicator3 timerViewpagerIndicator) {
    this.rootView = rootView;
    this.timerViewpager = timerViewpager;
    this.timerViewpagerIndicator = timerViewpagerIndicator;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTimerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTimerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_timer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTimerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.timer_viewpager;
      ViewPager2 timerViewpager = ViewBindings.findChildViewById(rootView, id);
      if (timerViewpager == null) {
        break missingId;
      }

      id = R.id.timer_viewpager_indicator;
      CircleIndicator3 timerViewpagerIndicator = ViewBindings.findChildViewById(rootView, id);
      if (timerViewpagerIndicator == null) {
        break missingId;
      }

      return new ActivityTimerBinding((ConstraintLayout) rootView, timerViewpager,
          timerViewpagerIndicator);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
