package com.example.techknow;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;

public class MaterialProgressBarAnimations {

    private MaterialProgressBarAnimations() {}

    public static ValueAnimator makeDeterminateCircularPrimaryProgressAnimator(
            final ProgressBar progressBar) {
        ValueAnimator animator = ValueAnimator.ofInt(0, 150);
        animator.setDuration(6000);
        animator.setInterpolator(new LinearInterpolator());
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.addUpdateListener(
                new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animator) {
                        int value = (int) animator.getAnimatedValue();

                            progressBar.setProgress(value);

                    }
                });
        return animator;
    }

    public static ValueAnimator makeDeterminateCircularPrimaryAndSecondaryProgressAnimator(
            final ProgressBar progressBar) {
        ValueAnimator animator = makeDeterminateCircularPrimaryProgressAnimator(progressBar);
        animator.addUpdateListener(
                new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animator) {
                        int value = Math.round(1.25f * (int) animator.getAnimatedValue());

                            progressBar.setSecondaryProgress(value);

                    }
                });
        return animator;
    }

}
