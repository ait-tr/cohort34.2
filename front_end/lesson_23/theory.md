В React, термин "props" обозначает сокращение от "properties" (свойства) и используется для передачи данных от родительских компонентов к дочерним компонентам. Это основной механизм взаимодействия между компонентами в React.

Когда компонент рендерится, он может принимать набор свойств (props), которые передаются ему из родительского компонента. Эти свойства доступны в компоненте как аргументы функции (для функциональных компонентов) или через this.props (для классовых компонентов).

Props являются неизменяемыми (immutable), что означает, что компонент не может изменять свои собственные props - они передаются ему "сверху" и остаются неизменными на протяжении жизненного цикла компонента.

Использование props позволяет создавать более гибкие и переиспользуемые компоненты, так как они могут быть настроены различными данными при их использовании в разных контекстах.