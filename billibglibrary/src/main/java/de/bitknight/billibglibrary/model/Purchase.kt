package de.bitknight.billibglibrary.model

data class Purchase (val orderId : String, val packageName : String, val productId : String,
                     val developerPayload : String, val purchaseToken : String, val purchaseState : PurchaseState,
                     val purchaseTime : Long, val autoRenewing : Boolean)
