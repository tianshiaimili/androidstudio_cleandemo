// Generated code from Butter Knife. Do not modify!
package com.yzy.supercleanmaster.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class AutoStartManageActivity$$ViewInjector<T extends com.yzy.supercleanmaster.ui.AutoStartManageActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427356, "field 'tabs'");
    target.tabs = finder.castView(view, 2131427356, "field 'tabs'");
    view = finder.findRequiredView(source, 2131427357, "field 'pager'");
    target.pager = finder.castView(view, 2131427357, "field 'pager'");
  }

  @Override public void reset(T target) {
    target.tabs = null;
    target.pager = null;
  }
}
