// Generated code from Butter Knife. Do not modify!
package com.yzy.supercleanmaster.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CopyOfSplishActivity$$ViewBinder<T extends com.yzy.supercleanmaster.ui.CopyOfSplishActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427378, "field 'mImageView'");
    target.mImageView = finder.castView(view, 2131427378, "field 'mImageView'");
  }

  @Override public void unbind(T target) {
    target.mImageView = null;
  }
}
