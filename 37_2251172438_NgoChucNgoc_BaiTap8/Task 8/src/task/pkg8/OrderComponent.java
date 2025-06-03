
package task.pkg8;

abstract class OrderComponent {
    protected OrderMediator _mediator;

    public void setMediator(OrderMediator mediator) {
        this._mediator = mediator;
    }

    public void changed(String event) {
        if (_mediator != null) {
            _mediator.notify(this, event);
        }
    }
}