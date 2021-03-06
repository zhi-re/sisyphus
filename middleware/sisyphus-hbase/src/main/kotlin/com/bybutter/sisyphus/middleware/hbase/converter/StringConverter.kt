package com.bybutter.sisyphus.middleware.hbase.converter

import com.bybutter.sisyphus.middleware.hbase.ValueConverter
import com.bybutter.sisyphus.middleware.hbase.annotation.DefaultConverter
import java.nio.charset.Charset

@DefaultConverter(String::class)
class StringConverter : ValueConverter<String> {
    override fun convert(value: String): ByteArray {
        return value.toByteArray()
    }

    override fun convertBack(value: ByteArray): String {
        return value.toString(Charset.defaultCharset())
    }
}
