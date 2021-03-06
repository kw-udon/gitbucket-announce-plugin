import fr.brouillard.gitbucket.announce.controller.AnnounceController
import gitbucket.core.controller.Context
import gitbucket.core.plugin.{Link, PluginRegistry}
import io.github.gitbucket.solidbase.model.Version

class Plugin extends gitbucket.core.plugin.Plugin {
  override val pluginId: String = "announce"

  override val pluginName: String = "Announce Plugin"

  override val description: String = "Allows to handle announces for gitbucket"

  override val versions: List[Version] = List(
    new Version("1.0.0")
    , new Version("1.1.0")
    , new Version("1.2.0")
    , new Version("1.3.0")
    , new Version("1.4.0")
    , new Version("1.5.0")
  )

  override val systemSettingMenus: Seq[(Context) => Option[Link]] = Seq(
    (ctx: Context) => Some(Link("announce", "Global Announce", "admin/announce"))
  )

  override val controllers = Seq(
    "/admin/announce" -> new AnnounceController()
  )
}
