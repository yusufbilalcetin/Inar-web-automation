package utils;

import ProcessBarPage.DownloadDialogPage;
import alerts.Alert_Type_Page;
import autoComplete.AccentFoldingPage;
import autoComplete.MultipleAndRemotePage;
import controlGroup.ToolBarTabPage;
import datePicker.DisplayMultipleMonthsPage;
import draggable.*;
import droppable.DroppableAcceptPage;
import droppable.DroppableDefFuncPage;
import droppable.RevertDraggablePositionPage;
import iframe.NestedIframePage;
import iframe.NormalIframePage;

import pages.getHomePage;
import pages.WebAutomationPage;

import resizable.AnimatePage;
import resizable.ResizableDefFuncPage;
import selectable.SelectableDefFuncPage;
import selectable.SerializePage;

public class Pages {

	private Alert_Type_Page alertTypesPage;

	private AutoScrollingPage autoScrollingPage;

	private DraggableDefFuncPage draggableDefFuncPage;

	private DroppableDefFuncPage droppableDefFuncPage;

	private getHomePage homePage;

	private NestedIframePage nestedIframePage;

	private ResizableDefFuncPage resizableDefFuncPage;

	private SelectableDefFuncPage selectableDefFuncPage;

	private WebAutomationPage webAutomationPage;

	private SerializePage serializePage;

	private AnimatePage animatePage;

	private ConstrainMovementPage constrainMovementPage;

	private CursorStylePage cursorStylePage;

	private HandlesPage handlesPage;

	private DroppableAcceptPage droppableAcceptPage;

	private RevertDraggablePositionPage revertDraggablePositionPage;

	private MultipleAndRemotePage multipleAndRemotePage;

	private AccentFoldingPage accentFoldingPage;

	private ToolBarTabPage toolBarTabPage;

	private DisplayMultipleMonthsPage displayMultipleMonthsPage;

	private NormalIframePage normalIframePage;

	private DownloadDialogPage downloadDialogPage;

	public Pages() {
		homePage = new getHomePage();
		webAutomationPage = new WebAutomationPage();
		draggableDefFuncPage = new DraggableDefFuncPage();
		autoScrollingPage = new AutoScrollingPage();
		droppableDefFuncPage = new DroppableDefFuncPage();
		resizableDefFuncPage = new ResizableDefFuncPage();
		selectableDefFuncPage = new SelectableDefFuncPage();
		nestedIframePage = new NestedIframePage();
		serializePage = new SerializePage();
		alertTypesPage = new Alert_Type_Page();
		animatePage = new AnimatePage();
		constrainMovementPage = new ConstrainMovementPage();
		cursorStylePage = new CursorStylePage();
		handlesPage = new HandlesPage();
		droppableAcceptPage = new DroppableAcceptPage();
		revertDraggablePositionPage = new RevertDraggablePositionPage();
		multipleAndRemotePage = new MultipleAndRemotePage();
		accentFoldingPage = new AccentFoldingPage();
		toolBarTabPage = new ToolBarTabPage();
		displayMultipleMonthsPage = new DisplayMultipleMonthsPage();
		normalIframePage = new NormalIframePage();
		downloadDialogPage = new DownloadDialogPage();

	}

	public getHomePage getHomePage() {
		return homePage;
	}

	public AnimatePage getAnimatePage() {
		return animatePage;
	}

	public NestedIframePage getNestedIframePage() {
		return nestedIframePage;
	}

	public Alert_Type_Page getAlertTypesPage() {
		return alertTypesPage;
	}

	public WebAutomationPage getWebAutomationPage() {
		return webAutomationPage;
	}

	public MultipleAndRemotePage getMultipleAndRemotePage() {
		return multipleAndRemotePage;
	}

	public DraggableDefFuncPage getDraggableDefFuncPage() {
		return draggableDefFuncPage;
	}

	public AutoScrollingPage getAutoScrollingPage() {
		return autoScrollingPage;
	}

	public DroppableDefFuncPage getDroppableDefFuncPage() {
		return droppableDefFuncPage;
	}

	public ResizableDefFuncPage getResizableDefFuncPage() {
		return resizableDefFuncPage;
	}

	public SelectableDefFuncPage getSelectableDefFuncPage() {
		return selectableDefFuncPage;
	}

	public SerializePage getSerializePage() {
		return serializePage;
	}

	public ConstrainMovementPage getConstrainMovementsPage() {
		return constrainMovementPage;
	}

	public CursorStylePage getCursorStylePage() {
		return cursorStylePage;
	}

	public HandlesPage getHandlesPage() {
		return handlesPage;
	}

	public DroppableAcceptPage getDroppableAcceptPage() {
		return droppableAcceptPage;
	}

	public RevertDraggablePositionPage getRevertDraggablePositionPage() {
		return revertDraggablePositionPage;
	}

	public AccentFoldingPage getAccentFoldingPage() {
		return accentFoldingPage;
	}

	public ToolBarTabPage getToolBarTabPage() {
		return toolBarTabPage;
	}

	public DisplayMultipleMonthsPage getDisplayMultipleMonthsPage() {
		return displayMultipleMonthsPage;
	}

	public NormalIframePage getNormalIframePage() {
		return normalIframePage;
	}

	public DownloadDialogPage getDownloadDialogPage() {
		return downloadDialogPage;
	}

}
