/*    */ package eu.shoroa.bridge.b.a;
/*    */ public enum b {
/*    */   LINEAR, SINE_IN, SINE_OUT, SINE_IN_OUT, QUAD_IN, QUAD_OUT, QUAD_IN_OUT, CUBIC_IN, CUBIC_OUT, CUBIC_IN_OUT, QUART_IN, QUART_OUT, QUART_IN_OUT, QUINT_IN, QUINT_OUT, QUINT_IN_OUT, EXPO_IN, EXPO_OUT, EXPO_IN_OUT, CIRC_IN, CIRC_OUT, CIRC_IN_OUT, BACK_IN, BACK_OUT, BACK_IN_OUT, ELASTIC_IN, ELASTIC_OUT, ELASTIC_IN_OUT, BOUNCE_OUT, BOUNCE_IN, BOUNCE_IN_OUT, FADE_IN, FADE_OUT, FADE_IN_OUT;
/*    */   
/*    */   static {
/*  6 */     LINEAR = new b("LINEAR", 0, in -> in.floatValue());
/*  7 */     SINE_IN = new b("SINE_IN", 1, in -> (float)(1.0D - Math.cos(in.floatValue() * Math.PI / 2.0D)));
/*  8 */     SINE_OUT = new b("SINE_OUT", 2, in -> (float)Math.sin(in.floatValue() * Math.PI / 2.0D));
/*  9 */     SINE_IN_OUT = new b("SINE_IN_OUT", 3, in -> (float)(-(Math.cos(Math.PI * in.floatValue()) - 1.0D) / 2.0D));
/* 10 */     QUAD_IN = new b("QUAD_IN", 4, in -> (float)Math.pow(in.floatValue(), 2.0D));
/* 11 */     QUAD_OUT = new b("QUAD_OUT", 5, in -> (float)(1.0D - Math.pow((1.0F - in.floatValue()), 2.0D)));
/* 12 */     QUAD_IN_OUT = new b("QUAD_IN_OUT", 6, in -> (float)((in.floatValue() < 0.5D) ? (2.0D * Math.pow(in.floatValue(), 2.0D)) : (1.0D - Math.pow((-2.0F * in.floatValue() + 2.0F), 2.0D) / 2.0D)));
/* 13 */     CUBIC_IN = new b("CUBIC_IN", 7, in -> (float)Math.pow(in.floatValue(), 3.0D));
/* 14 */     CUBIC_OUT = new b("CUBIC_OUT", 8, in -> (float)(1.0D - Math.pow((1.0F - in.floatValue()), 3.0D)));
/* 15 */     CUBIC_IN_OUT = new b("CUBIC_IN_OUT", 9, in -> (float)((in.floatValue() < 0.5D) ? (4.0D * Math.pow(in.floatValue(), 3.0D)) : (1.0D - Math.pow((-2.0F * in.floatValue() + 2.0F), 3.0D) / 2.0D)));
/* 16 */     QUART_IN = new b("QUART_IN", 10, in -> (float)Math.pow(in.floatValue(), 4.0D));
/* 17 */     QUART_OUT = new b("QUART_OUT", 11, in -> (float)(1.0D - Math.pow((1.0F - in.floatValue()), 4.0D)));
/* 18 */     QUART_IN_OUT = new b("QUART_IN_OUT", 12, in -> (float)((in.floatValue() < 0.5D) ? (8.0D * Math.pow(in.floatValue(), 4.0D)) : (1.0D - Math.pow((-2.0F * in.floatValue() + 2.0F), 4.0D) / 2.0D)));
/* 19 */     QUINT_IN = new b("QUINT_IN", 13, in -> (float)Math.pow(in.floatValue(), 5.0D));
/* 20 */     QUINT_OUT = new b("QUINT_OUT", 14, in -> (float)(1.0D - Math.pow((1.0F - in.floatValue()), 5.0D)));
/* 21 */     QUINT_IN_OUT = new b("QUINT_IN_OUT", 15, in -> (float)((in.floatValue() < 0.5D) ? (16.0D * Math.pow(in.floatValue(), 5.0D)) : (1.0D - Math.pow((-2.0F * in.floatValue() + 2.0F), 5.0D) / 2.0D)));
/* 22 */     EXPO_IN = new b("EXPO_IN", 16, in -> (float)Math.pow(2.0D, (10.0F * in.floatValue() - 10.0F)));
/* 23 */     EXPO_OUT = new b("EXPO_OUT", 17, in -> (float)(1.0D - Math.pow(2.0D, (10.0F * in.floatValue() - 10.0F))));
/* 24 */     EXPO_IN_OUT = new b("EXPO_IN_OUT", 18, in -> (float)((in.floatValue() < 0.5D) ? (Math.pow(2.0D, (20.0F * in.floatValue() - 10.0F)) / 2.0D) : ((2.0D - Math.pow(2.0D, (-20.0F * in.floatValue() + 10.0F))) / 2.0D)));
/* 25 */     CIRC_IN = new b("CIRC_IN", 19, in -> (float)(1.0D - Math.sqrt(1.0D - Math.pow(in.floatValue(), 2.0D))));
/* 26 */     CIRC_OUT = new b("CIRC_OUT", 20, in -> (float)Math.sqrt(1.0D - Math.pow((in.floatValue() - 1.0F), 2.0D)));
/* 27 */     CIRC_IN_OUT = new b("CIRC_IN_OUT", 21, in -> (float)((in.floatValue() < 0.5D) ? ((1.0D - Math.sqrt(1.0D - Math.pow((2.0F * in.floatValue()), 2.0D))) / 2.0D) : ((Math.sqrt(1.0D - Math.pow((-2.0F * in.floatValue() + 2.0F), 2.0D)) + 1.0D) / 2.0D)));
/* 28 */     BACK_IN = new b("BACK_IN", 22, in -> (float)(2.70158D * Math.pow(in.floatValue(), 3.0D) - 1.70158D * Math.pow(in.floatValue(), 2.0D)));
/* 29 */     BACK_OUT = new b("BACK_OUT", 23, in -> (float)(2.70158D * Math.pow((in.floatValue() - 1.0F), 3.0D) - 1.70158D * Math.pow((in.floatValue() - 1.0F), 2.0D)));
/* 30 */     BACK_IN_OUT = new b("BACK_IN_OUT", 24, in -> (float)((in.floatValue() < 0.5D) ? (Math.pow((2.0F * in.floatValue()), 2.0D) * (7.189819D * in.floatValue() - 2.5949095D) / 2.0D) : ((Math.pow((2.0F * in.floatValue() - 2.0F), 2.0D) * (3.5949095D * (in.floatValue() * 2.0F - 2.0F) + 2.5949095D) + 2.0D) / 2.0D)));
/* 31 */     ELASTIC_IN = new b("ELASTIC_IN", 25, in -> (float)(-Math.pow(2.0D, (10.0F * in.floatValue() - 10.0F)) * Math.sin((in.floatValue() * 10.0F) - 10.75D) * 6.283185307179586D / 3.0D));
/* 32 */     ELASTIC_OUT = new b("ELASTIC_OUT", 26, in -> (float)(Math.pow(2.0D, (-10.0F * in.floatValue())) * Math.sin((in.floatValue() * 10.0F - 0.0F)) * 6.283185307179586D / 3.0D) + 1.0F);
/* 33 */     ELASTIC_IN_OUT = new b("ELASTIC_IN_OUT", 27, in -> (float)((in.floatValue() < 0.5D) ? (-(Math.pow(2.0D, (20.0F * in.floatValue() - 10.0F)) * Math.sin(((20.0F * in.floatValue()) - 11.125D) * 6.283185307179586D / 4.5D)) / 2.0D) : (Math.pow(2.0D, (-20.0F * in.floatValue() + 10.0F)) * Math.sin(((20.0F * in.floatValue()) - 11.125D) * 6.283185307179586D / 4.5D) / 2.0D + 1.0D)));
/* 34 */     BOUNCE_OUT = new b("BOUNCE_OUT", 28, in -> (float)a(in.floatValue()));
/* 35 */     BOUNCE_IN = new b("BOUNCE_IN", 29, in -> (float)(1.0D - a((1.0F - in.floatValue()))));
/* 36 */     BOUNCE_IN_OUT = new b("BOUNCE_IN_OUT", 30, in -> (float)((in.floatValue() < 0.5D) ? (1.0D - a((1.0F - in.floatValue() * 2.0F)) / 2.0D) : (1.0D + a((in.floatValue() * 2.0F + 1.0F)) / 2.0D)));
/* 37 */     FADE_IN = new b("FADE_IN", 31, in -> (float)(1.0D - Math.cos(in.floatValue() * Math.PI / 2.0D)));
/* 38 */     FADE_OUT = new b("FADE_OUT", 32, in -> (float)Math.sin(in.floatValue() * Math.PI / 2.0D));
/* 39 */     FADE_IN_OUT = new b("FADE_IN_OUT", 33, in -> (float)(-(Math.cos(Math.PI * in.floatValue()) - 1.0D) / 2.0D));
/*    */   }
/*    */   c a;
/*    */   b(c func) {
/* 43 */     this.a = func;
/*    */   }
/*    */   
/*    */   private static double a(double in) {
/* 47 */     double n1 = 7.5625D;
/* 48 */     double d1 = 2.75D;
/*    */     
/* 50 */     if (in < 1.0D / d1)
/* 51 */       return n1 * in * in; 
/* 52 */     if (in < 2.0D / d1)
/* 53 */       return n1 * (in -= 1.5D / d1) * in + 0.75D; 
/* 54 */     if (in < 2.5D / d1) {
/* 55 */       return n1 * (in -= 2.25D / d1) * in + 0.9375D;
/*    */     }
/* 57 */     return n1 * (in -= 2.625D / d1) * in + 0.984375D;
/*    */   }
/*    */ }


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\b\a\b.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */