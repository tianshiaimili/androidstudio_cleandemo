// Generated code from Butter Knife. Do not modify!
package com.yzy.supercleanmaster.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MainFragment$$ViewInjector<T extends com.yzy.supercleanmaster.fragment.MainFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427386, "field 'arcStore'");
    target.arcStore = finder.castView(view, 2131427386, "field 'arcStore'");
    view = finder.findRequiredView(source, 2131427388, "field 'arcProcess'");
    target.arcProcess = finder.castView(view, 2131427388, "field 'arcProcess'");
    view = finder.findRequiredView(source, 2131427387, "field 'capacity'");
    target.capacity = finder.castView(view, 2131427387, "field 'capacity'");
    view = finder.findRequiredView(source, 2131427395, "field 'memory_speed'");
    target.memory_speed = finder.castView(view, 2131427395, "field 'memory_speed'");
    view = finder.findRequiredView(source, 2131427397, "field 'waste_manager'");
    target.waste_manager = finder.castView(view, 2131427397, "field 'waste_manager'");
    view = finder.findRequiredView(source, 2131427399, "field 'start_manager'");
    target.start_manager = finder.castView(view, 2131427399, "field 'start_manager'");
    view = finder.findRequiredView(source, 2131427401, "field 'software_manager'");
    target.software_manager = finder.castView(view, 2131427401, "field 'software_manager'");
  }

  @Override public void reset(T target) {
    target.arcStore = null;
    target.arcProcess = null;
    target.capacity = null;
    target.memory_speed = null;
    target.waste_manager = null;
    target.start_manager = null;
    target.software_manager = null;
  }
}
