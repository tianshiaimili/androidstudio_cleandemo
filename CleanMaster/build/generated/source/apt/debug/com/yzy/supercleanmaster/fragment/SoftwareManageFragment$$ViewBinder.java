// Generated code from Butter Knife. Do not modify!
package com.yzy.supercleanmaster.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SoftwareManageFragment$$ViewBinder<T extends com.yzy.supercleanmaster.fragment.SoftwareManageFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427367, "field 'listview'");
    target.listview = finder.castView(view, 2131427367, "field 'listview'");
    view = finder.findRequiredView(source, 2131427381, "field 'topText'");
    target.topText = finder.castView(view, 2131427381, "field 'topText'");
    view = finder.findRequiredView(source, 2131427370, "field 'mProgressBar'");
    target.mProgressBar = view;
    view = finder.findRequiredView(source, 2131427372, "field 'mProgressBarText'");
    target.mProgressBarText = finder.castView(view, 2131427372, "field 'mProgressBarText'");
  }

  @Override public void unbind(T target) {
    target.listview = null;
    target.topText = null;
    target.mProgressBar = null;
    target.mProgressBarText = null;
  }
}
