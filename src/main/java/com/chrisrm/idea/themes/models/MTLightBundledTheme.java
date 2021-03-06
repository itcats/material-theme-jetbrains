/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 Chris Magnussen and Elior Boukhobza
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 *
 */

package com.chrisrm.idea.themes.models;

import com.chrisrm.idea.themes.MTLightCustomTheme;
import com.intellij.util.ObjectUtils;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.List;

/**
 * Represents a theme that is parsable from XML
 */
public class MTLightBundledTheme extends MTLightCustomTheme implements Serializable, MTBundledTheme {
  private List<MTThemeColor> colors;
  private String themeId;

  public MTLightBundledTheme() {
    this("mt.light_custom", "External Theme", true);
  }

  protected MTLightBundledTheme(@NotNull final String id,
                                @NotNull final String editorColorsScheme,
                                final boolean dark) {
    super();
  }

  @NotNull
  @Override
  public String getId() {
    return "mt.light_custom";
  }

  public static String notificationsColor = "80cbc4";
  public static String treeSelectionColor = "546E7A50";
  public static String highlightColor = "D2D4D5";
  public static String secondBorderColor = "d3e1e8";
  public static String tableSelectedColor = "D2D4D5";
  public static String contrastColor = "F4F4F4";
  public static String disabledColor = "D2D4D5";
  public static String secondaryBackgroundColor = "eae8e8";
  public static String buttonColor = "F3F4F5";
  public static String selectionForegroundColor = "FFFFFF";
  public static String selectionBackgroundColor = "546E7A";
  public static String textColor = "94A7B0";
  public static String foregroundColor = "546E7A";
  public static String backgroundColor = "FAFAFA";

  public List<MTThemeColor> getColors() {
    return colors;
  }

  public void setColors(final List<MTThemeColor> colors) {
    this.colors = colors;
  }

  @NotNull
  @Override
  public String getThemeId() {
    return themeId;
  }

  public void setThemeId(final String themeId) {
    this.themeId = themeId;
  }

  @Override
  protected String getNotificationsColorString() {
    return ObjectUtils.notNull(findColor("notifications"), notificationsColor);
  }

  @Override
  protected String getTreeSelectionColorString() {
    return ObjectUtils.notNull(findColor("treeSelection"), treeSelectionColor);
  }

  @Override
  protected String getHighlightColorString() {
    return ObjectUtils.notNull(findColor("highlight"), highlightColor);
  }

  @Override
  protected String getSecondBorderColorString() {
    return ObjectUtils.notNull(findColor("secondBorder"), secondBorderColor);
  }

  @Override
  protected String getTableSelectedColorString() {
    return ObjectUtils.notNull(findColor("tableSelected"), tableSelectedColor);
  }

  @Override
  protected String getContrastColorString() {
    return ObjectUtils.notNull(findColor("contrast"), contrastColor);
  }

  @Override
  protected String getDisabledColorString() {
    return ObjectUtils.notNull(findColor("disabled"), disabledColor);
  }

  @Override
  protected String getSecondaryBackgroundColorString() {
    return ObjectUtils.notNull(findColor("secondaryBackground"), secondaryBackgroundColor);
  }

  @Override
  protected String getButtonColorString() {
    return ObjectUtils.notNull(findColor("button"), buttonColor);
  }

  @Override
  protected String getSelectionForegroundColorString() {
    return ObjectUtils.notNull(findColor("selectionForeground"), selectionForegroundColor);
  }

  @Override
  protected String getSelectionBackgroundColorString() {
    return ObjectUtils.notNull(findColor("selectionBackground"), selectionBackgroundColor);
  }

  @Override
  protected String getTextColorString() {
    return ObjectUtils.notNull(findColor("text"), textColor);
  }

  @Override
  protected String getForegroundColorString() {
    return ObjectUtils.notNull(findColor("foreground"), foregroundColor);
  }

  @Override
  protected String getBackgroundColorString() {
    return ObjectUtils.notNull(findColor("background"), backgroundColor);
  }

  private String findColor(final String id) {
    MTThemeColor result = null;
    for (final MTThemeColor color : colors) {
      if (color.getId().equals(id)) {
        result = color;
        break;
      }
    }

    if (result != null) {
      return result.getValue();
    }
    return null;
  }

}
