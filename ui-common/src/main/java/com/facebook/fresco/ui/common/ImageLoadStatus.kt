/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.fresco.ui.common

enum class ImageLoadStatus(val value: Int) {
  UNKNOWN(-1),
  REQUESTED(0),
  INTERMEDIATE_AVAILABLE(2),
  SUCCESS(3),
  CANCELED(4),
  ERROR(5),
  DRAW(6),
  EMPTY_EVENT(7);

  /**
   * This was probably only used in open source version, so we might be able to remove this custom
   * string mapping.
   */
  override fun toString(): String {
    return when (this) {
      REQUESTED -> "requested"
      SUCCESS -> "success"
      CANCELED -> "canceled"
      INTERMEDIATE_AVAILABLE -> "intermediate_available"
      ERROR -> "error"
      else -> "unknown"
    }
  }

  companion object {
    private val VALUES = values()

    fun fromInt(value: Int) = VALUES.firstOrNull { it.value == value }
  }
}
