// Generated code from Butter Knife. Do not modify!
package com.yzy.supercleanmaster.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MainActivity$$ViewInjector<T extends com.yzy.supercleanmaster.ui.MainActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427360, "field 'container'");
    target.container = finder.castView(view, 2131427360, "field 'container'");
    view = finder.findRequiredView(source, 2131427359, "field 'mDrawerLayout'");
    target.mDrawerLayout = finder.castView(view, 2131427359, "field 'mDrawerLayout'");
  }

  @Override public void reset(T target) {
    target.container = null;
    target.mDrawerLayout = null;
  }
}
