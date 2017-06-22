package de.bitknight.billibglibrary.model

data class SkuDetails(val productId: String, val priceAmountMicros: Long, val purchaseType: PurchaseType,
                      val price: String, val priceCurrencyCode: String, val title: String, val description: String)