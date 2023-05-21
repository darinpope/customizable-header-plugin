package io.jenkins.plugins.customizable_header;

import hudson.Extension;
import io.jenkins.plugins.customizable_header.logo.Logo;
import jenkins.views.PartialHeader;

@Extension
public class CustomHeader extends PartialHeader {

    @Override
  public boolean isEnabled() {
      return CustomHeaderConfiguration.getInstance().isEnabled();
  }

  public String getTitle() {
    return CustomHeaderConfiguration.getInstance().getTitle();
  }

  public String getLogoText() {
    return CustomHeaderConfiguration.getInstance().getLogoText();
  }

  public String getCssResourceUrl() {

    return CustomHeaderConfiguration.getInstance().getCssResourceUrl();
  }

  public Logo getLogo() {
    return CustomHeaderConfiguration.getInstance().getLogo();
  }

  @Override
  public int getSupportedHeaderVersion() {
    return 1;
  }
}