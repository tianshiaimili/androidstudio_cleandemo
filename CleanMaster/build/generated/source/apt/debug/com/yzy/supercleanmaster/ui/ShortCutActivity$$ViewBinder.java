// Generated code from Butter Knife. Do not modify!
package com.yzy.supercleanmaster.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ShortCutActivity$$ViewBinder<T extends com.yzy.supercleanmaster.ui.ShortCutActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427375, "field 'layoutAnim'");
    target.layoutAnim = finder.castView(view, 2131427375, "field 'layoutAnim'");
    view = finder.findRequiredView(source, 2131427374, "field 'mRelativeLayout'");
    target.mRelativeLayout = finder.castView(view, 2131427374, "field 'mRelativeLayout'");
    view = finder.findRequiredView(source, 2131427377, "field 'cleanLightImg'");
    target.cleanLightImg = finder.castView(view, 2131427377, "field 'cleanLightImg'");
  }

  @Override public void unbind(T target) {
    target.layoutAnim = null;
    target.mRelativeLayout = null;
    target.cleanLightImg = null;
  }
}
