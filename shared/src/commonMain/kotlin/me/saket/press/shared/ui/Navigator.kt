package me.saket.press.shared.ui

import me.saket.press.shared.AndroidParcel

interface Navigator {
  // https://www.urbandictionary.com/define.php?term=lfg
  fun lfg(screen: ScreenKey)
  fun clearTopAndLfg(screen: ScreenKey)
  fun goBack(otherwise: (() -> Unit)? = null)
}

interface ScreenKey : AndroidParcel
