
package org.holoeverywhere.slidingmenu;

import android.view.View;
import android.view.ViewGroup.LayoutParams;

public interface SlidingActivityBase {

    /**
     * Gets the SlidingMenu associated with this activity.
     * 
     * @return the SlidingMenu associated with this activity.
     */
    public SlidingMenu getSlidingMenu();

    /**
     * Set the behind view content from a layout resource. The resource will be
     * inflated, adding all top-level views to the behind view.
     * 
     * @param layoutResID Resource ID to be inflated.
     */
    public void setBehindContentView(int layoutResID);

    /**
     * Set the behind view content to an explicit view. This view is placed
     * directly into the behind view 's view hierarchy. It can itself be a
     * complex view hierarchy. When calling this method, the layout parameters
     * of the specified view are ignored. Both the width and the height of the
     * view are set by default to MATCH_PARENT. To use your own layout
     * parameters, invoke setContentView(android.view.View,
     * android.view.ViewGroup.LayoutParams) instead.
     * 
     * @param view The desired content to display.
     */
    public void setBehindContentView(View view);

    /**
     * Set the behind view content to an explicit view. This view is placed
     * directly into the behind view 's view hierarchy. It can itself be a
     * complex view hierarchy.
     * 
     * @param view The desired content to display.
     * @param layoutParams Layout parameters for the view.
     */
    public void setBehindContentView(View view, LayoutParams layoutParams);

    /**
     * Controls whether the ActionBar slides along with the above view when the
     * menu is opened, or if it stays in place.
     * 
     * @param slidingActionBarEnabled True if you want the ActionBar to slide
     *            along with the SlidingMenu, false if you want the ActionBar to
     *            stay in place
     */
    public void setSlidingActionBarEnabled(boolean slidingActionBarEnabled);

    /**
     * Close the SlidingMenu and show the above view.
     */
    public void showAbove();

    /**
     * Open the SlidingMenu and show the behind view.
     */
    public void showBehind();

    /**
     * Toggle the SlidingMenu. If it is open, it will be closed, and vice versa.
     */
    public void toggle();

}
