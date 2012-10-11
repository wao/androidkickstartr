package com.athomas.androidkickstartr.util;

import static com.athomas.androidkickstartr.CanonicalNameConsts.ACRA;
import static com.athomas.androidkickstartr.CanonicalNameConsts.ACTIVITY;
import static com.athomas.androidkickstartr.CanonicalNameConsts.AFTER_VIEWS;
import static com.athomas.androidkickstartr.CanonicalNameConsts.APPLICATION;
import static com.athomas.androidkickstartr.CanonicalNameConsts.ARRAY_ADAPTER;
import static com.athomas.androidkickstartr.CanonicalNameConsts.BACKGROUND;
import static com.athomas.androidkickstartr.CanonicalNameConsts.BUNDLE;
import static com.athomas.androidkickstartr.CanonicalNameConsts.CHARSEQUENCE;
import static com.athomas.androidkickstartr.CanonicalNameConsts.CONTEXT;
import static com.athomas.androidkickstartr.CanonicalNameConsts.EACTIVITY;
import static com.athomas.androidkickstartr.CanonicalNameConsts.FRAGMENT_ACTIVITY;
import static com.athomas.androidkickstartr.CanonicalNameConsts.FRAGMENT_PAGER_ADAPTER;
import static com.athomas.androidkickstartr.CanonicalNameConsts.FRAGMENT_TRANSACTION;
import static com.athomas.androidkickstartr.CanonicalNameConsts.GET;
import static com.athomas.androidkickstartr.CanonicalNameConsts.MENU;
import static com.athomas.androidkickstartr.CanonicalNameConsts.OVERRIDE;
import static com.athomas.androidkickstartr.CanonicalNameConsts.REPORTS_CRASHES;
import static com.athomas.androidkickstartr.CanonicalNameConsts.REST;
import static com.athomas.androidkickstartr.CanonicalNameConsts.REST_SERVICE;
import static com.athomas.androidkickstartr.CanonicalNameConsts.SHERLOCK_ACTION_BAR;
import static com.athomas.androidkickstartr.CanonicalNameConsts.SHERLOCK_ACTIVITY;
import static com.athomas.androidkickstartr.CanonicalNameConsts.SHERLOCK_FRAGMENT_ACTIVITY;
import static com.athomas.androidkickstartr.CanonicalNameConsts.SHERLOCK_MENU;
import static com.athomas.androidkickstartr.CanonicalNameConsts.SHERLOCK_NAVIGATION_LISTENER;
import static com.athomas.androidkickstartr.CanonicalNameConsts.SHERLOCK_TAB;
import static com.athomas.androidkickstartr.CanonicalNameConsts.SHERLOCK_TAB_LISTENER;
import static com.athomas.androidkickstartr.CanonicalNameConsts.STRING;
import static com.athomas.androidkickstartr.CanonicalNameConsts.TEXT_VIEW;
import static com.athomas.androidkickstartr.CanonicalNameConsts.UITHREAD;
import static com.athomas.androidkickstartr.CanonicalNameConsts.VIEW_BY_ID;
import static com.athomas.androidkickstartr.CanonicalNameConsts.VIEW_PAGER;

import com.sun.codemodel.JClass;
import com.sun.codemodel.JCodeModel;

public class RefHelper {

	private final JCodeModel codeModel;
	private JClass textView;
	private JClass viewById;
	private JClass viewPager;
	private JClass r;

	public RefHelper(JCodeModel codeModel) {
		this.codeModel = codeModel;
	}

	public JClass ref(String fullName) {
		return codeModel.ref(fullName);
	}

	public JClass override() {
		return ref(OVERRIDE);
	}

	public JClass charSequence() {
		return ref(CHARSEQUENCE);
	}

	public JClass string() {
		return ref(STRING);
	}

	public JClass activity() {
		return ref(ACTIVITY);
	}

	public JClass fragmentActivity() {
		return ref(FRAGMENT_ACTIVITY);
	}

	public JClass fragmentPagerAdapter() {
		return ref(FRAGMENT_PAGER_ADAPTER);
	}

	public JClass textView() {
		if (textView == null) {
			textView = ref(TEXT_VIEW);
		}
		return textView;
	}

	public JClass bundle() {
		return ref(BUNDLE);
	}

	public JClass menu() {
		return ref(MENU);
	}

	public JClass context() {
		return ref(CONTEXT);
	}

	public JClass arrayAdapter() {
		return ref(ARRAY_ADAPTER);
	}

	public JClass application() {
		return ref(APPLICATION);
	}

	public JClass r(String name) {
		if (r == null) {
			r = ref(name);
		}
		return r;
	}

	public JClass r() {
		if (r == null) {
			throw new NullPointerException("call r(String name) method at least once");
		}
		return r;
	}

	// Android Support v4

	public JClass viewPager() {
		if (viewPager == null) {
			viewPager = ref(VIEW_PAGER);
		}
		return viewPager;
	}

	public JClass fragmentTransaction() {
		return ref(FRAGMENT_TRANSACTION);
	}

	// AndroidAnnotations

	public JClass eactivity() {
		return ref(EACTIVITY);
	}

	public JClass viewById() {
		if (viewById == null) {
			viewById = ref(VIEW_BY_ID);
		}
		return viewById;
	}

	public JClass afterViews() {
		return ref(AFTER_VIEWS);
	}

	public JClass background() {
		return ref(BACKGROUND);
	}

	public JClass uithread() {
		return ref(UITHREAD);
	}

	public JClass rest() {
		return ref(REST);
	}

	public JClass get() {
		return ref(GET);
	}

	public JClass restService() {
		return ref(REST_SERVICE);
	}

	// Action bar Sherlock

	public JClass sActivity() {
		return ref(SHERLOCK_ACTIVITY);
	}

	public JClass sFragmentActivity() {
		return ref(SHERLOCK_FRAGMENT_ACTIVITY);
	}

	public JClass sMenu() {
		return ref(SHERLOCK_MENU);
	}

	public JClass sNavigationListener() {
		return ref(SHERLOCK_NAVIGATION_LISTENER);
	}

	public JClass sActionBar() {
		return ref(SHERLOCK_ACTION_BAR);
	}

	public JClass sTabListener() {
		return ref(SHERLOCK_TAB_LISTENER);
	}

	public JClass sTab() {
		return ref(SHERLOCK_TAB);
	}

	// Acra

	public JClass reportsCrashes() {
		return ref(REPORTS_CRASHES);
	}

	public JClass acra() {
		return ref(ACRA);
	}

}
