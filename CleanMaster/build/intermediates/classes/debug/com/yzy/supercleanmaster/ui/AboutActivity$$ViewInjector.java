// Generated code from Butter Knife. Do not modify!
package com.yzy.supercleanmaster.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class AboutActivity$$ViewInjector<T extends com.yzy.supercleanmaster.ui.AboutActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427349, "field 'subVersion'");
    target.subVersion = finder.castView(view, 2131427349, "field 'subVersion'");
  }

  @Override public void reset(T target) {
    target.subVersion = null;
  }
}
