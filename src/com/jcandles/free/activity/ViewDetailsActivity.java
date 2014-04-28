package com.jcandles.free.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

import com.jcandles.free.R;
import com.jcandles.free.ads.AdsSettings;
import com.smaato.soma.BannerView;

public class ViewDetailsActivity extends Activity {
	
	private BannerView mBanner;
	
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.details);
		
		setTitle(getString(R.string.app_name) + ": ");
		
		int chapter = getIntent().getExtras().getInt("CHAPTER");
		
		WebView webContent = (WebView)findViewById(R.id.web_content);
		StringBuffer content = new StringBuffer(getText(R.string.details_html_header));
		
		if (chapter == 0) {
			setTitle(getTitle() + getString(R.string.list_hammer));
			content.append(getText(R.string.details_hammer));
		} else if (chapter == 1) {
			setTitle(getTitle() + getString(R.string.list_hanging_man));
			content.append(getText(R.string.details_hanging_man));
		} else if (chapter == 2) {
			setTitle(getTitle() + getString(R.string.list_bullish_engulfing));
			content.append(getText(R.string.details_bullish_engulfing));
		} else if (chapter == 3) {
			setTitle(getTitle() + getString(R.string.list_bearish_engulfing));
			content.append(getText(R.string.details_bearish_engulfing));
		} else if (chapter == 4) {
			setTitle(getTitle() + getString(R.string.list_dark_cloud_cover));
			content.append(getText(R.string.details_dark_cloud_cover));
		} else if (chapter == 5) {
			setTitle(getTitle() + getString(R.string.list_piercing_pattern));
			content.append(getText(R.string.details_piercing_pattern));
		} else if (chapter == 6) {
			setTitle(getTitle() + getString(R.string.list_morning_star));
			content.append(getText(R.string.details_morning_star));
		} else if (chapter == 7) {
			setTitle(getTitle() + getString(R.string.list_evening_star));
			content.append(getText(R.string.details_evening_star));
		} else if (chapter == 8) {
			setTitle(getTitle() + getString(R.string.list_abandoned_baby));
			content.append(getText(R.string.details_abandoned_baby));
		} else if (chapter == 9) {
			setTitle(getTitle() + getString(R.string.list_belt_hold_line));
			content.append(getText(R.string.details_belt_hold_line));
		} else if (chapter == 10) {
			setTitle(getTitle() + getString(R.string.list_advance_block));
			content.append(getText(R.string.details_advance_block));
		} else if (chapter == 11) {
			setTitle(getTitle() + getString(R.string.list_harami));
			content.append(getText(R.string.details_harami));
		} else if (chapter == 12) {
			setTitle(getTitle() + getString(R.string.list_harami_cross));
			content.append(getText(R.string.details_harami_cross));
		} else if (chapter == 13) {
			setTitle(getTitle() + getString(R.string.list_inverted_hammer));
			content.append(getText(R.string.details_inverted_hammer));
		} else if (chapter == 14) {
			setTitle(getTitle() + getString(R.string.list_mat_hold_pattern));
			content.append(getText(R.string.details_mat_hold_pattern));
		} else if (chapter == 15) {
			setTitle(getTitle() + getString(R.string.list_one_neck_line));
			content.append(getText(R.string.details_one_neck_line));
		} else if (chapter == 16) {
			setTitle(getTitle() + getString(R.string.list_shooting_star));
			content.append(getText(R.string.details_shooting_star));
		} else if (chapter == 17) {
			setTitle(getTitle() + getString(R.string.list_stalled_pattern));
			content.append(getText(R.string.details_stalled_pattern));
		} else if (chapter == 18) {
			setTitle(getTitle() + getString(R.string.list_tasuki_gaps));
			content.append(getText(R.string.details_tasuki_gaps));
		} else if (chapter == 19) {
			setTitle(getTitle() + getString(R.string.list_three_crows));
			content.append(getText(R.string.details_three_crows));
		} else if (chapter == 20) {
			setTitle(getTitle() + getString(R.string.list_three_methods));
			content.append(getText(R.string.details_three_methods));
		} else if (chapter == 21) {
			setTitle(getTitle() + getString(R.string.list_window));
			content.append(getText(R.string.details_window));
		}

		content.append(getText(R.string.details_html_footer));
		
		webContent.loadDataWithBaseURL(null, content.toString(), "text/html", "UTF-8", null);
		
		Button back = (Button)findViewById(R.id.b_back);
		back.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				finish();
			}
		});
		
		mBanner = (BannerView)findViewById(R.id.banner2);
		mBanner.getAdSettings().setPublisherId(AdsSettings.publisherId);
		mBanner.getAdSettings().setAdspaceId(AdsSettings.adspaceId);
		mBanner.setAutoReloadEnabled(true);
		mBanner.asyncLoadNewBanner();
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		mBanner.setAutoReloadEnabled(true);
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		mBanner.setAutoReloadEnabled(false);
	}
}
