package com.bestbuy.bbym.ise.drp.loanerphone;

import com.bestbuy.bbym.ise.drp.common.BaseNavPageTest;
import com.bestbuy.bbym.ise.drp.utils.DrpConstants;

/**
 * JUnit test for {@link ViewCheckedOutPage}.
 */
public class ViewCheckedOutPageTest extends BaseNavPageTest {

    /**
     * Checks that all roles except {@link DrpConstants#DRP_BEAST} and
     * {@link DrpConstants#SHP_USER} have access to the page.
     */
    @Override
    public void testPageAccess() {
	assertAccessAllowed(ViewCheckedOutPage.class, DrpConstants.DRP_ADMIN, DrpConstants.DRP_MANAGER,
		DrpConstants.DRP_LEAD, DrpConstants.DRP_USER, DrpConstants.DRP_TEAM);
	assertAccessDenied(ViewCheckedOutPage.class, DrpConstants.DRP_BEAST, DrpConstants.SHP_USER,
		DrpConstants.SHP_MANAGER);
    }

    /**
     * Tests rendering of page and presence of components.
     */
    @Override
    public void testRenderMyPage() {
	// start and render the test page
	ViewCheckedOutPage page = new ViewCheckedOutPage(null, null);
	tester.startPage(page);

	// Check that the right page was rendered (no unexpected redirect or
	// intercept)
	tester.assertRenderedPage(ViewCheckedOutPage.class);
	tester.assertNoErrorMessage();

	assertNavigation();
    }
}
