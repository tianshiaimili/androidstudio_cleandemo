// Generated code from Butter Knife. Do not modify!
package com.yzy.supercleanmaster.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class RelaxFragment$$ViewInjector<T extends com.yzy.supercleanmaster.fragment.RelaxFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427384, "field 'mWebView'");
    target.mWebView = finder.castView(view, 2131427384, "field 'mWebView'");
    view = finder.findRequiredView(source, 2131427383, "field 'mProgressBar'");
    target.mProgressBar = finder.castView(view, 2131427383, "field 'mProgressBar'");
  }

  @Override public void reset(T target) {
    target.mWebView = null;
    target.mProgressBar = null;
  }
}
