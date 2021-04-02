package c.theprakhar.flexnest.databinding;
import c.theprakhar.flexnest.R;
import c.theprakhar.flexnest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class StoryItemBindingImpl extends StoryItemBinding implements c.theprakhar.flexnest.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public StoryItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private StoryItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.LinearLayout) bindings[0]
            );
        this.dp.setTag(null);
        this.name.setTag(null);
        this.storylinear.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new c.theprakhar.flexnest.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.item == variableId) {
            setItem((c.theprakhar.flexnest.models.User) variable);
        }
        else if (BR.itemClick == variableId) {
            setItemClick((c.theprakhar.flexnest.ItemClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable c.theprakhar.flexnest.models.User Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setItemClick(@Nullable c.theprakhar.flexnest.ItemClickListener ItemClick) {
        this.mItemClick = ItemClick;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.itemClick);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String itemAvatar = null;
        c.theprakhar.flexnest.models.User item = mItem;
        c.theprakhar.flexnest.ItemClickListener itemClick = mItemClick;
        java.lang.String itemFirstName = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (item != null) {
                    // read item.avatar
                    itemAvatar = item.getAvatar();
                    // read item.first_name
                    itemFirstName = item.getFirst_name();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            c.theprakhar.flexnest.models.User.loadImage(this.dp, itemAvatar);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, itemFirstName);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.storylinear.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        c.theprakhar.flexnest.models.User item = mItem;
        // itemClick != null
        boolean itemClickJavaLangObjectNull = false;
        // itemClick
        c.theprakhar.flexnest.ItemClickListener itemClick = mItemClick;



        itemClickJavaLangObjectNull = (itemClick) != (null);
        if (itemClickJavaLangObjectNull) {



            itemClick.onStoryClick(item);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): itemClick
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}