// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JetwayObject.java

package com.zbluesoftware.fsxp.bgl.object;

import com.zbluesoftware.fsxp.bgl.item.*;

// Referenced classes of package com.zbluesoftware.fsxp.bgl.object:
//            BaseObject

public class JetwayObject extends BaseObject
{

    public JetwayObject()
    {
        this(0, 0);
    }

    public JetwayObject(int offset, int length)
    {
        name = "Jetway";
        this.offset = offset;
        this.length = length;
        addItem(new IDItem(), true);
        addItem(new SizeItem(), true);
        addItem(new GateNumberItem(), true);
        addItem(new GateNameItem(), true);
    }

    public String toString()
    {
        return name;
    }

    public static final String ID1 = "3A";
    public static final String ID2 = "00";
}
