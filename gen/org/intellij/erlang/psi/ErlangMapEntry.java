// This is a generated file. Not intended for manual editing.
package org.intellij.erlang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ErlangMapEntry extends ErlangCompositeElement {

  @NotNull
  List<ErlangExpression> getExpressionList();

  @Nullable
  PsiElement getAssoc();

  @Nullable
  PsiElement getMatch();

}
