package com.eme22.floatingsearchview.rxbinding

import com.eme22.floatingsearchbiew.rxbinding.RxFloatingSearchView
import com.eme22.floatingsearchview.FloatingSearchView
import com.jakewharton.rxbinding4.InitialValueObservable

fun FloatingSearchView.queryChanges(minQueryLimit: Int = 1): InitialValueObservable<CharSequence> = RxFloatingSearchView.queryChanges(this, minQueryLimit)