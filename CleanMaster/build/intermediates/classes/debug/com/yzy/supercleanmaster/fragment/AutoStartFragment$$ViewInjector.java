// Generated code from Butter Knife. Do not modify!
package com.yzy.supercleanmaster.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class AutoStartFragment$$ViewInjector<T extends com.yzy.supercleanmaster.fragment.AutoStartFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427367, "field 'listview'");
    target.listview = finder.castView(view, 2131427367, "field 'listview'");
    view = finder.findRequiredView(source, 2131427368, "field 'bottom_lin'");
    target.bottom_lin = finder.castView(view, 2131427368, "field 'bottom_lin'");
    view = finder.findRequiredView(source, 2131427382, "field 'disableButton' and method 'onClickDisable'");
    target.disableButton = finder.castView(view, 2131427382, "field 'disableButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickDisable();
        }
      });
    view = finder.findRequiredView(source, 2131427381, "field 'topText'");
    target.topText = finder.castView(view, 2131427381, "field 'topText'");
  }

  @Override public void reset(T target) {
    target.listview = null;
    target.bottom_lin = null;
    target.disableButton = null;
    target.topText = null;
  }
}
