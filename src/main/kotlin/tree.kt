//import jdk.nashorn.internal.objects.NativeArray.forEach
//
////class TreeNode<T : Comparable<T>>(value:T){
////    var value:T = value
////    var parent:TreeNode<T>? = null
////
////    var children:MutableList<TreeNode<T>> = mutableListOf()
////
////    fun addChild(childNode:TreeNode<T>): TreeNode<T> {
////        children.add(childNode)
////        childNode.parent = this
////        return this
////    }
////
////    fun addChildren(vararg childNode: TreeNode<T>): TreeNode<T> {
////        childNode.sortBy { it.value }
////        for (node in childNode) {
////            node.parent = this
////        }
////        childNode.forEach { it ->
////        }
////    }
////
////    override fun toString(): String {
////        var s = "${value}"
////        if (!children.isEmpty()) {
////            s += " {" + children.map { it.toString() } + " }"
////        }
////        return s
////    }
////}
//
//class TreeNode<T>(value:T?) {
//    fun addChild(leaf: TreeNode<T>): TreeNode<T> {
//
//    }
//}
//
//fun main(args: Array<String>) {
//    // 1, 2, 3 = 6
//    // -1, 3, 4 = 6
//    // 1, 5, 0 = 6
//    // 1, 3, 2 = invalid]
//
//    val tree = TreeNode<Int>(null)
//    val nums = arrayOf(1, 2, 3, 4, 5, 6)
//    var pointer = 0
//
//    nums
//        .forEachIndexed { index, value ->
//            val node1 = tree.addChild(TreeNode(value))
//            nums.forEachIndexed { moveIndex, moveValue ->
//                if (index > pointer) {
//                    val node = TreeNode(value)
//                    node1.addChild(node)
//                }
//            }
//            pointer ++
//        }
//    }
//
//
////    println(tree)
//}