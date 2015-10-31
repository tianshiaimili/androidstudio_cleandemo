// Generated code from Butter Knife. Do not modify!
package com.yzy.supercleanmaster.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DeciveInfoFragment$$ViewBinder<T extends com.yzy.supercleanmaster.fragment.DeciveInfoFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427384, "field 'mWebView'");
    target.mWebView = finder.castView(view, 2131427384, "field 'mWebView'");
    view = finder.findRequiredView(source, 2131427383, "field 'mProgressBar'");
    target.mProgressBar = finder.castView(view, 2131427383, "field 'mProgressBar'");
  }

  @Override public void unbind(T target) {
    target.mWebView = null;
    target.mProgressBar = null;
  }
}
