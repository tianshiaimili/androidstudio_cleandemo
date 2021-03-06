// Generated code from Butter Knife. Do not modify!
package com.yzy.supercleanmaster.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MemoryCleanActivity$$ViewInjector<T extends com.yzy.supercleanmaster.ui.MemoryCleanActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427367, "field 'mListView'");
    target.mListView = finder.castView(view, 2131427367, "field 'mListView'");
    view = finder.findRequiredView(source, 2131427364, "field 'mwaveView'");
    target.mwaveView = finder.castView(view, 2131427364, "field 'mwaveView'");
    view = finder.findRequiredView(source, 2131427363, "field 'header'");
    target.header = finder.castView(view, 2131427363, "field 'header'");
    view = finder.findRequiredView(source, 2131427365, "field 'textCounter'");
    target.textCounter = finder.castView(view, 2131427365, "field 'textCounter'");
    view = finder.findRequiredView(source, 2131427366, "field 'sufix'");
    target.sufix = finder.castView(view, 2131427366, "field 'sufix'");
    view = finder.findRequiredView(source, 2131427368, "field 'bottom_lin'");
    target.bottom_lin = finder.castView(view, 2131427368, "field 'bottom_lin'");
    view = finder.findRequiredView(source, 2131427370, "field 'mProgressBar'");
    target.mProgressBar = view;
    view = finder.findRequiredView(source, 2131427372, "field 'mProgressBarText'");
    target.mProgressBarText = finder.castView(view, 2131427372, "field 'mProgressBarText'");
    view = finder.findRequiredView(source, 2131427369, "field 'clearButton' and method 'onClickClear'");
    target.clearButton = finder.castView(view, 2131427369, "field 'clearButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickClear();
        }
      });
  }

  @Override public void reset(T target) {
    target.mListView = null;
    target.mwaveView = null;
    target.header = null;
    target.textCounter = null;
    target.sufix = null;
    target.bottom_lin = null;
    target.mProgressBar = null;
    target.mProgressBarText = null;
    target.clearButton = null;
  }
}
